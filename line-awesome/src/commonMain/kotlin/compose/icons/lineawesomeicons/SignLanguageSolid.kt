package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.SignLanguageSolid: ImageVector
    get() {
        if (_signLanguageSolid != null) {
            return _signLanguageSolid!!
        }
        _signLanguageSolid = Builder(name = "SignLanguageSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.225f, 1.367f)
                lineTo(18.607f, 2.543f)
                lineTo(26.982f, 14.07f)
                curveTo(26.938f, 14.667f, 26.64f, 15.219f, 26.145f, 15.564f)
                lineTo(23.34f, 17.523f)
                curveTo(22.453f, 18.143f, 21.249f, 17.952f, 20.598f, 17.088f)
                lineTo(14.799f, 9.398f)
                lineTo(13.201f, 10.602f)
                lineTo(19.0f, 18.293f)
                curveTo(19.788f, 19.337f, 20.98f, 19.889f, 22.191f, 19.889f)
                curveTo(22.983f, 19.889f, 23.784f, 19.652f, 24.484f, 19.162f)
                lineTo(27.289f, 17.203f)
                curveTo(28.36f, 16.456f, 29.0f, 15.23f, 29.0f, 13.924f)
                lineTo(29.0f, 7.0f)
                lineTo(27.0f, 7.0f)
                lineTo(27.0f, 10.689f)
                lineTo(20.225f, 1.367f)
                close()
                moveTo(17.211f, 2.322f)
                lineTo(15.594f, 3.498f)
                lineTo(20.84f, 10.719f)
                lineTo(22.457f, 9.543f)
                lineTo(17.211f, 2.322f)
                close()
                moveTo(15.371f, 4.895f)
                lineTo(13.752f, 6.07f)
                lineTo(18.379f, 12.438f)
                lineTo(19.996f, 11.262f)
                lineTo(15.371f, 4.895f)
                close()
                moveTo(12.58f, 15.186f)
                lineTo(11.42f, 16.813f)
                lineTo(14.48f, 19.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 21.0f)
                lineTo(17.252f, 21.0f)
                curveTo(17.717f, 21.377f, 18.0f, 21.941f, 18.0f, 22.545f)
                lineTo(18.0f, 26.0f)
                curveTo(18.0f, 27.103f, 17.103f, 28.0f, 16.0f, 28.0f)
                lineTo(6.0f, 28.0f)
                lineTo(6.0f, 30.0f)
                lineTo(16.0f, 30.0f)
                curveTo(18.206f, 30.0f, 20.0f, 28.206f, 20.0f, 26.0f)
                lineTo(20.0f, 22.545f)
                curveTo(20.0f, 21.256f, 19.373f, 20.038f, 18.324f, 19.289f)
                lineTo(12.58f, 15.186f)
                close()
                moveTo(2.0f, 22.0f)
                lineTo(2.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(3.0f, 25.0f)
                lineTo(3.0f, 27.0f)
                lineTo(11.0f, 27.0f)
                lineTo(11.0f, 25.0f)
                lineTo(3.0f, 25.0f)
                close()
            }
        }
        .build()
        return _signLanguageSolid!!
    }

private var _signLanguageSolid: ImageVector? = null
