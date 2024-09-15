package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import compose.icons.CssGgIcons

public val CssGgIcons.BandAid: ImageVector
    get() {
        if (_bandAid != null) {
            return _bandAid!!
        }
        _bandAid = Builder(name = "BandAid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.939f, 9.765f)
                curveTo(11.705f, 10.265f, 11.111f, 10.482f, 10.61f, 10.248f)
                curveTo(10.109f, 10.015f, 9.893f, 9.42f, 10.126f, 8.92f)
                curveTo(10.36f, 8.419f, 10.955f, 8.202f, 11.455f, 8.436f)
                curveTo(11.956f, 8.669f, 12.172f, 9.264f, 11.939f, 9.765f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.92f, 13.874f)
                curveTo(9.42f, 14.107f, 10.015f, 13.891f, 10.248f, 13.39f)
                curveTo(10.482f, 12.889f, 10.265f, 12.295f, 9.765f, 12.061f)
                curveTo(9.264f, 11.828f, 8.669f, 12.044f, 8.436f, 12.545f)
                curveTo(8.202f, 13.045f, 8.419f, 13.64f, 8.92f, 13.874f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.874f, 15.08f)
                curveTo(13.64f, 15.581f, 13.045f, 15.798f, 12.545f, 15.564f)
                curveTo(12.044f, 15.331f, 11.828f, 14.736f, 12.061f, 14.235f)
                curveTo(12.294f, 13.735f, 12.889f, 13.518f, 13.39f, 13.752f)
                curveTo(13.891f, 13.985f, 14.107f, 14.58f, 13.874f, 15.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.235f, 11.939f)
                curveTo(14.736f, 12.172f, 15.331f, 11.956f, 15.564f, 11.455f)
                curveTo(15.797f, 10.955f, 15.581f, 10.36f, 15.08f, 10.126f)
                curveTo(14.58f, 9.893f, 13.985f, 10.109f, 13.752f, 10.61f)
                curveTo(13.518f, 11.111f, 13.735f, 11.705f, 14.235f, 11.939f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.071f, 1.124f)
                curveTo(14.068f, -0.276f, 10.498f, 1.023f, 9.098f, 4.026f)
                lineTo(4.026f, 14.902f)
                curveTo(2.626f, 17.905f, 3.925f, 21.475f, 6.929f, 22.876f)
                curveTo(9.932f, 24.276f, 13.502f, 22.977f, 14.902f, 19.974f)
                lineTo(19.973f, 9.098f)
                curveTo(21.374f, 6.095f, 20.075f, 2.525f, 17.071f, 1.124f)
                close()
                moveTo(13.935f, 17.316f)
                lineTo(17.316f, 10.065f)
                lineTo(10.065f, 6.684f)
                lineTo(6.684f, 13.935f)
                lineTo(13.935f, 17.316f)
                close()
                moveTo(13.09f, 19.128f)
                lineTo(5.839f, 15.747f)
                curveTo(4.905f, 17.75f, 5.772f, 20.129f, 7.774f, 21.063f)
                curveTo(9.776f, 21.997f, 12.156f, 21.131f, 13.09f, 19.128f)
                close()
                moveTo(16.226f, 2.937f)
                curveTo(18.228f, 3.871f, 19.094f, 6.25f, 18.161f, 8.253f)
                lineTo(10.91f, 4.872f)
                curveTo(11.844f, 2.87f, 14.224f, 2.003f, 16.226f, 2.937f)
                close()
            }
        }
        .build()
        return _bandAid!!
    }

private var _bandAid: ImageVector? = null
