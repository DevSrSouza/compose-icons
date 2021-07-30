package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Dart: ImageVector
    get() {
        if (_dart != null) {
            return _dart!!
        }
        _dart = Builder(name = "Dart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.105f, 4.105f)
                reflectiveCurveTo(9.158f, 1.58f, 11.684f, 0.316f)
                arcToRelative(3.079f, 3.079f, 0.0f, false, true, 1.481f, -0.315f)
                curveToRelative(0.766f, 0.047f, 1.677f, 0.788f, 1.677f, 0.788f)
                lineTo(24.0f, 9.948f)
                verticalLineToRelative(9.789f)
                horizontalLineToRelative(-4.263f)
                lineTo(19.737f, 24.0f)
                lineTo(9.789f, 24.0f)
                lineToRelative(-9.0f, -9.0f)
                curveTo(0.303f, 14.5f, 0.0f, 13.795f, 0.0f, 13.105f)
                curveToRelative(0.0f, -0.319f, 0.18f, -0.818f, 0.316f, -1.105f)
                lineToRelative(3.789f, -7.895f)
                close()
                moveTo(4.784f, 4.784f)
                verticalLineToRelative(11.787f)
                curveToRelative(0.002f, 0.543f, 0.021f, 1.024f, 0.498f, 1.508f)
                lineTo(10.204f, 23.0f)
                horizontalLineToRelative(8.533f)
                verticalLineToRelative(-4.263f)
                lineTo(4.784f, 4.784f)
                close()
                moveTo(16.839f, 4.106f)
                curveToRelative(-0.899f, -0.896f, -1.809f, -1.78f, -2.74f, -2.643f)
                curveToRelative(-0.302f, -0.267f, -0.567f, -0.468f, -1.07f, -0.462f)
                curveToRelative(-0.37f, 0.014f, -0.87f, 0.195f, -0.87f, 0.195f)
                lineTo(6.341f, 4.105f)
                lineToRelative(10.498f, 0.001f)
                close()
            }
        }
        .build()
        return _dart!!
    }

private var _dart: ImageVector? = null
