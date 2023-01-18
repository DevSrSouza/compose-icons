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

public val IonIcons.TennisballSharp: ImageVector
    get() {
        if (_tennisballSharp != null) {
            return _tennisballSharp!!
        }
        _tennisballSharp = Builder(name = "TennisballSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.4f, 480.0f)
                arcToRelative(181.0f, 181.0f, 0.0f, false, false, 3.22f, -22.86f)
                curveToRelative(0.35f, -4.61f, 0.53f, -9.31f, 0.53f, -14.0f)
                curveToRelative(0.0f, -100.0f, -81.34f, -181.32f, -181.32f, -181.32f)
                arcTo(181.72f, 181.72f, 0.0f, false, false, 32.0f, 265.61f)
                arcTo(224.2f, 224.2f, 0.0f, false, false, 246.4f, 480.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(284.63f, 227.37f)
                arcTo(222.73f, 222.73f, 0.0f, false, true, 219.0f, 68.83f)
                arcToRelative(227.09f, 227.09f, 0.0f, false, true, 2.62f, -34.42f)
                arcTo(224.41f, 224.41f, 0.0f, false, false, 34.41f, 221.58f)
                arcTo(227.09f, 227.09f, 0.0f, false, true, 68.83f, 219.0f)
                arcToRelative(222.73f, 222.73f, 0.0f, false, true, 158.54f, 65.67f)
                arcTo(222.73f, 222.73f, 0.0f, false, true, 293.0f, 443.17f)
                curveToRelative(0.0f, 5.74f, -0.22f, 11.54f, -0.65f, 17.23f)
                reflectiveCurveToRelative(-1.11f, 11.51f, -2.0f, 17.2f)
                arcTo(224.42f, 224.42f, 0.0f, false, false, 477.59f, 290.42f)
                arcTo(227.09f, 227.09f, 0.0f, false, true, 443.17f, 293.0f)
                arcTo(222.73f, 222.73f, 0.0f, false, true, 284.63f, 227.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(443.17f, 250.15f)
                arcTo(181.72f, 181.72f, 0.0f, false, false, 480.0f, 246.39f)
                arcTo(224.2f, 224.2f, 0.0f, false, false, 265.61f, 32.0f)
                arcToRelative(181.72f, 181.72f, 0.0f, false, false, -3.76f, 36.83f)
                curveTo(261.85f, 168.81f, 343.19f, 250.15f, 443.17f, 250.15f)
                close()
            }
        }
        .build()
        return _tennisballSharp!!
    }

private var _tennisballSharp: ImageVector? = null
