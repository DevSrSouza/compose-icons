package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.SdCard: ImageVector
    get() {
        if (_sdCard != null) {
            return _sdCard!!
        }
        _sdCard = Builder(name = "SdCard", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 0.0f)
                lineTo(128.0f, 0.0f)
                lineTo(0.0f, 128.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(256.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(384.0f, 64.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(160.0f, 160.0f)
                horizontalLineToRelative(-48.0f)
                lineTo(112.0f, 64.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(240.0f, 160.0f)
                horizontalLineToRelative(-48.0f)
                lineTo(192.0f, 64.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(320.0f, 160.0f)
                horizontalLineToRelative(-48.0f)
                lineTo(272.0f, 64.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(96.0f)
                close()
            }
        }
        .build()
        return _sdCard!!
    }

private var _sdCard: ImageVector? = null
