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

public val SimpleIcons.Bandlab: ImageVector
    get() {
        if (_bandlab != null) {
            return _bandlab!!
        }
        _bandlab = Builder(name = "Bandlab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8771f, 17.5886f)
                curveTo(12.84f, 17.5886f, 15.3f, 15.78f, 15.3f, 13.32f)
                curveToRelative(0.0f, -0.72f, -0.1543f, -1.4314f, -0.4543f, -2.0914f)
                lineToRelative(-3.4114f, -8.34f)
                horizontalLineTo(17.16f)
                lineTo(15.6514f, 0.0f)
                horizontalLineTo(7.4829f)
                lineToRelative(4.68f, 11.5629f)
                curveTo(10.1657f, 12.0f, 8.34f, 13.56f, 8.34f, 15.36f)
                curveToRelative(0.0f, 1.3029f, 0.9429f, 2.2286f, 2.5371f, 2.2286f)
                curveToRelative(0.0274f, 0.0f, 0.0f, 0.0f, 5.1f, -11.5029f)
                horizontalLineTo(19.32f)
                lineTo(22.8857f, 12.24f)
                arcTo(8.8286f, 8.8286f, 0.0f, false, true, 24.0f, 16.26f)
                curveToRelative(0.0f, 4.5f, -3.5486f, 7.74f, -8.5714f, 7.74f)
                horizontalLineTo(8.5714f)
                curveTo(3.54f, 24.0f, 0.0f, 20.76f, 0.0f, 16.26f)
                curveToRelative(0.0429f, -1.4143f, 0.4286f, -2.7857f, 1.1143f, -4.0286f)
                lineTo(4.6714f, 6.0857f)
                horizontalLineToRelative(3.3429f)
                lineToRelative(-4.1743f, 7.26f)
                arcToRelative(6.0514f, 6.0514f, 0.0f, false, false, -0.8229f, 2.8629f)
                curveToRelative(0.0f, 2.8629f, 1.9543f, 4.9029f, 5.6571f, 4.9029f)
                horizontalLineToRelative(6.6514f)
                curveToRelative(3.6857f, 0.0f, 5.6571f, -2.04f, 5.6571f, -4.9029f)
                arcToRelative(6.0514f, 6.0514f, 0.0f, false, false, -0.8314f, -2.8629f)
                lineToRelative(-4.1743f, -7.26f)
                horizontalLineTo(19.32f)
                horizontalLineToRelative(-3.3429f)
            }
        }
        .build()
        return _bandlab!!
    }

private var _bandlab: ImageVector? = null
