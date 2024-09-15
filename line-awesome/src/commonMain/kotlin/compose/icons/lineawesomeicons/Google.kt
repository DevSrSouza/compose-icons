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

public val LineAwesomeIcons.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.684f, 15.406f)
                curveTo(18.684f, 13.43f, 21.895f, 13.258f, 21.895f, 9.395f)
                curveTo(21.895f, 6.598f, 19.949f, 5.258f, 19.75f, 5.137f)
                lineTo(21.688f, 5.137f)
                lineTo(23.625f, 4.0f)
                lineTo(17.348f, 4.0f)
                curveTo(10.961f, 4.0f, 9.938f, 8.469f, 9.938f, 9.949f)
                curveTo(9.938f, 12.156f, 11.664f, 14.898f, 15.137f, 14.898f)
                curveTo(15.453f, 14.898f, 15.789f, 14.879f, 16.145f, 14.84f)
                curveTo(16.086f, 15.004f, 15.836f, 15.566f, 15.836f, 16.074f)
                curveTo(15.836f, 17.137f, 16.516f, 17.813f, 16.75f, 18.223f)
                curveTo(12.949f, 18.188f, 8.375f, 19.836f, 8.375f, 23.504f)
                curveTo(8.375f, 24.844f, 9.527f, 28.0f, 14.941f, 28.0f)
                curveTo(21.117f, 28.0f, 22.988f, 24.188f, 22.988f, 22.051f)
                curveTo(22.984f, 17.969f, 18.684f, 17.293f, 18.684f, 15.406f)
                close()
                moveTo(16.586f, 14.043f)
                curveTo(14.426f, 14.043f, 12.602f, 11.324f, 12.602f, 8.418f)
                curveTo(12.602f, 7.555f, 13.016f, 5.047f, 15.406f, 5.047f)
                curveTo(18.484f, 5.047f, 19.234f, 9.609f, 19.234f, 10.852f)
                curveTo(19.234f, 11.141f, 19.438f, 14.043f, 16.586f, 14.043f)
                close()
                moveTo(16.438f, 26.68f)
                curveTo(14.457f, 26.68f, 11.039f, 25.836f, 11.039f, 22.836f)
                curveTo(11.039f, 21.797f, 11.645f, 19.082f, 16.902f, 19.082f)
                curveTo(17.172f, 19.082f, 17.406f, 19.094f, 17.605f, 19.113f)
                curveTo(18.699f, 19.93f, 20.965f, 21.109f, 20.965f, 23.281f)
                curveTo(20.965f, 24.266f, 20.379f, 26.68f, 16.438f, 26.68f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
