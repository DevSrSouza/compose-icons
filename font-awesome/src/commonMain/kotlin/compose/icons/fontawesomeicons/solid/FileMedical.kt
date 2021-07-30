package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FileMedical: ImageVector
    get() {
        if (_fileMedical != null) {
            return _fileMedical!!
        }
        _fileMedical = Builder(name = "FileMedical", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(377.0f, 105.0f)
                lineTo(279.1f, 7.0f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7.0f, -17.0f, -7.0f)
                lineTo(256.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0.0f, -6.3f, -2.5f, -12.4f, -7.0f, -16.9f)
                close()
                moveTo(224.0f, 136.0f)
                lineTo(224.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                verticalLineToRelative(464.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(384.0f, 160.0f)
                lineTo(248.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                close()
                moveTo(288.0f, 296.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                horizontalLineToRelative(-56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, -3.6f, -8.0f, -8.0f)
                verticalLineToRelative(-56.0f)
                horizontalLineToRelative(-56.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, -3.6f, -8.0f, -8.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _fileMedical!!
    }

private var _fileMedical: ImageVector? = null
