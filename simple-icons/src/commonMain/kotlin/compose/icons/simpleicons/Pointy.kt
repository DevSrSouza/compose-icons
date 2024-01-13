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

public val SimpleIcons.Pointy: ImageVector
    get() {
        if (_pointy != null) {
            return _pointy!!
        }
        _pointy = Builder(name = "Pointy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.076f, 0.025f)
                reflectiveCurveTo(4.52f, 0.234f, 2.833f, 2.751f)
                curveToRelative(-1.58f, 2.351f, -1.465f, 5.145f, -1.1f, 8.121f)
                curveTo(2.096f, 13.831f, 2.587f, 24.0f, 2.587f, 24.0f)
                curveToRelative(0.002f, 0.003f, 11.235f, -11.526f, 11.23f, -11.506f)
                curveToRelative(1.75f, -1.805f, 2.408f, -4.468f, 2.395f, -5.961f)
                curveToRelative(-0.037f, -4.274f, -3.461f, -6.815f, -8.136f, -6.508f)
                close()
                moveTo(8.853f, 10.799f)
                curveToRelative(-1.991f, 0.0f, -3.604f, -1.632f, -3.604f, -3.645f)
                curveToRelative(0.0f, -2.015f, 1.614f, -3.649f, 3.604f, -3.649f)
                reflectiveCurveToRelative(3.642f, 1.512f, 3.642f, 3.527f)
                curveToRelative(0.0f, 2.011f, -1.652f, 3.767f, -3.642f, 3.767f)
                close()
                moveTo(11.618f, 7.058f)
                arcToRelative(1.58f, 1.58f, 0.0f, true, true, -3.162f, 0.0f)
                arcToRelative(1.58f, 1.58f, 0.0f, false, true, 3.162f, 0.0f)
                close()
                moveTo(22.497f, 8.489f)
                reflectiveCurveToRelative(-2.325f, 0.158f, -3.644f, 0.57f)
                curveToRelative(-1.317f, 0.413f, -2.502f, 1.076f, -2.502f, 1.076f)
                reflectiveCurveToRelative(0.495f, -0.852f, 0.705f, -2.361f)
                curveToRelative(0.207f, -1.511f, -0.14f, -2.652f, -0.14f, -2.652f)
                lineToRelative(5.581f, 3.367f)
                close()
            }
        }
        .build()
        return _pointy!!
    }

private var _pointy: ImageVector? = null
