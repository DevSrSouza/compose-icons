package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PersonRemove: ImageVector
    get() {
        if (_personRemove != null) {
            return _personRemove!!
        }
        _personRemove = Builder(name = "PersonRemove", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 256.0f)
                curveToRelative(52.79f, 0.0f, 99.43f, -49.71f, 104.0f, -110.82f)
                curveToRelative(2.27f, -30.7f, -7.36f, -59.33f, -27.12f, -80.6f)
                curveTo(345.33f, 43.57f, 318.0f, 32.0f, 288.0f, 32.0f)
                curveToRelative(-30.24f, 0.0f, -57.59f, 11.5f, -77.0f, 32.38f)
                curveToRelative(-19.63f, 21.11f, -29.2f, 49.8f, -27.0f, 80.78f)
                curveTo(188.49f, 206.28f, 235.12f, 256.0f, 288.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(495.38f, 439.76f)
                curveToRelative(-8.44f, -46.82f, -34.79f, -86.15f, -76.19f, -113.75f)
                curveTo(382.42f, 301.5f, 335.83f, 288.0f, 288.0f, 288.0f)
                reflectiveCurveToRelative(-94.42f, 13.5f, -131.19f, 38.0f)
                curveToRelative(-41.4f, 27.6f, -67.75f, 66.93f, -76.19f, 113.75f)
                curveToRelative(-1.93f, 10.73f, 0.69f, 21.34f, 7.19f, 29.11f)
                arcTo(30.94f, 30.94f, 0.0f, false, false, 112.0f, 480.0f)
                horizontalLineTo(464.0f)
                arcToRelative(30.94f, 30.94f, 0.0f, false, false, 24.21f, -11.13f)
                curveTo(494.69f, 461.1f, 497.31f, 450.49f, 495.38f, 439.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 216.0f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineTo(144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _personRemove!!
    }

private var _personRemove: ImageVector? = null
