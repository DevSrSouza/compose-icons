package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
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

public val CssGgIcons.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.264f, 2.293f)
                curveTo(20.873f, 1.902f, 20.24f, 1.902f, 19.849f, 2.293f)
                lineTo(18.977f, 3.165f)
                curveTo(17.862f, 2.633f, 16.486f, 2.828f, 15.562f, 3.752f)
                lineTo(4.955f, 14.358f)
                lineTo(10.612f, 20.015f)
                lineTo(21.219f, 9.408f)
                curveTo(22.143f, 8.485f, 22.338f, 7.109f, 21.805f, 5.994f)
                lineTo(22.678f, 5.121f)
                curveTo(23.068f, 4.731f, 23.068f, 4.098f, 22.678f, 3.707f)
                lineTo(21.264f, 2.293f)
                close()
                moveTo(16.996f, 10.804f)
                lineTo(10.612f, 17.187f)
                lineTo(7.784f, 14.358f)
                lineTo(14.167f, 7.975f)
                lineTo(16.996f, 10.804f)
                close()
                moveTo(18.814f, 8.985f)
                lineTo(19.805f, 7.994f)
                curveTo(20.195f, 7.604f, 20.195f, 6.971f, 19.805f, 6.58f)
                lineTo(18.39f, 5.166f)
                curveTo(18.0f, 4.775f, 17.367f, 4.775f, 16.976f, 5.166f)
                lineTo(15.985f, 6.157f)
                lineTo(18.814f, 8.985f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.95f)
                lineTo(4.122f, 15.172f)
                lineTo(9.778f, 20.829f)
                lineTo(2.0f, 22.95f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
