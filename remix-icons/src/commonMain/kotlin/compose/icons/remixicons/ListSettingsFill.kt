package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ListSettingsFill: ImageVector
    get() {
        if (_listSettingsFill != null) {
            return _listSettingsFill!!
        }
        _listSettingsFill = Builder(name = "ListSettingsFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 18.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 4.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 4.0f)
                close()
                moveTo(20.674f, 13.025f)
                lineToRelative(1.156f, -0.391f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(-0.916f, 0.805f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, 0.0f, 1.658f)
                lineToRelative(0.916f, 0.805f)
                lineToRelative(-1.0f, 1.732f)
                lineToRelative(-1.156f, -0.391f)
                curveToRelative(-0.41f, 0.37f, -0.898f, 0.655f, -1.435f, 0.83f)
                lineTo(19.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.24f, -1.196f)
                arcToRelative(3.996f, 3.996f, 0.0f, false, true, -1.434f, -0.83f)
                lineToRelative(-1.156f, 0.392f)
                lineToRelative(-1.0f, -1.732f)
                lineToRelative(0.916f, -0.805f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, 0.0f, -1.658f)
                lineToRelative(-0.916f, -0.805f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(1.156f, 0.391f)
                curveToRelative(0.41f, -0.37f, 0.898f, -0.655f, 1.435f, -0.83f)
                lineTo(17.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.24f, 1.196f)
                curveToRelative(0.536f, 0.174f, 1.024f, 0.46f, 1.434f, 0.83f)
                close()
                moveTo(18.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _listSettingsFill!!
    }

private var _listSettingsFill: ImageVector? = null
