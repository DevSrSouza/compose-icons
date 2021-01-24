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

public val SolidGroup.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(592.0f, 0.0f)
                lineTo(48.0f, 0.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 0.0f, 48.0f)
                verticalLineToRelative(320.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineToRelative(240.0f)
                verticalLineToRelative(32.0f)
                lineTo(112.0f, 448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(352.0f, 448.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(240.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, -48.0f)
                lineTo(640.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, -48.0f)
                close()
                moveTo(576.0f, 352.0f)
                lineTo(64.0f, 352.0f)
                lineTo(64.0f, 64.0f)
                horizontalLineToRelative(512.0f)
                close()
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
