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

public val SimpleIcons.Steinberg: ImageVector
    get() {
        if (_steinberg != null) {
            return _steinberg!!
        }
        _steinberg = Builder(name = "Steinberg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.481f, 12.629f)
                curveToRelative(0.642f, -0.371f, 0.642f, -1.009f, 0.0f, -1.379f)
                lineTo(14.711f, 8.495f)
                curveToRelative(-0.642f, -0.371f, -1.195f, -0.052f, -1.195f, 0.69f)
                verticalLineToRelative(5.508f)
                curveToRelative(0.0f, 0.741f, 0.553f, 1.06f, 1.195f, 0.69f)
                close()
                moveTo(11.999f, 2.726f)
                curveToRelative(5.122f, 0.0f, 9.274f, 4.153f, 9.274f, 9.274f)
                reflectiveCurveToRelative(-4.153f, 9.274f, -9.274f, 9.274f)
                reflectiveCurveTo(2.726f, 17.122f, 2.726f, 12.0f)
                reflectiveCurveToRelative(4.152f, -9.274f, 9.274f, -9.274f)
                moveToRelative(0.0f, -2.726f)
                curveTo(5.383f, 0.0f, 0.001f, 5.383f, 0.001f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(11.999f, -5.383f, 11.999f, -12.0f)
                reflectiveCurveToRelative(-5.383f, -12.0f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _steinberg!!
    }

private var _steinberg: ImageVector? = null
