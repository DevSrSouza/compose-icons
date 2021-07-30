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

public val LineAwesomeIcons.DiagnosesSolid: ImageVector
    get() {
        if (_diagnosesSolid != null) {
            return _diagnosesSolid!!
        }
        _diagnosesSolid = Builder(name = "DiagnosesSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(13.8f, 5.0f, 12.0f, 6.8f, 12.0f, 9.0f)
                curveTo(12.0f, 11.2f, 13.8f, 13.0f, 16.0f, 13.0f)
                curveTo(18.2f, 13.0f, 20.0f, 11.2f, 20.0f, 9.0f)
                curveTo(20.0f, 6.8f, 18.2f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 13.0f)
                lineTo(14.6191f, 13.0f)
                curveTo(12.8191f, 13.0f, 11.1691f, 13.9795f, 10.2891f, 15.5195f)
                curveTo(10.9991f, 15.5995f, 11.6195f, 15.9793f, 12.0195f, 16.5293f)
                curveTo(12.5395f, 15.5893f, 13.5291f, 15.0f, 14.6191f, 15.0f)
                lineTo(17.3809f, 15.0f)
                curveTo(17.8209f, 15.0f, 18.2294f, 15.0898f, 18.6094f, 15.2598f)
                curveTo(18.8194f, 14.5698f, 19.3209f, 14.0205f, 19.9609f, 13.7305f)
                curveTo(19.2009f, 13.2605f, 18.3109f, 13.0f, 17.3809f, 13.0f)
                lineTo(16.0f, 13.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(17.12f, 7.0f, 18.0f, 7.88f, 18.0f, 9.0f)
                curveTo(18.0f, 10.12f, 17.12f, 11.0f, 16.0f, 11.0f)
                curveTo(14.88f, 11.0f, 14.0f, 10.12f, 14.0f, 9.0f)
                curveTo(14.0f, 7.88f, 14.88f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(21.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 15.0f)
                close()
                moveTo(10.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 17.0f)
                close()
                moveTo(22.7305f, 17.8105f)
                curveTo(22.2805f, 18.2405f, 21.67f, 18.5f, 21.0f, 18.5f)
                curveTo(20.95f, 18.5f, 20.8898f, 18.5002f, 20.8398f, 18.4902f)
                lineTo(22.0898f, 21.4102f)
                lineTo(22.2793f, 21.8809f)
                lineTo(22.8105f, 21.9707f)
                lineTo(27.8105f, 22.9707f)
                lineTo(28.1895f, 21.0293f)
                lineTo(23.7207f, 20.1191f)
                lineTo(22.7305f, 17.8105f)
                close()
                moveTo(15.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 18.0f)
                close()
                moveTo(8.3691f, 19.9004f)
                lineTo(8.2793f, 20.1191f)
                lineTo(3.8105f, 21.0293f)
                lineTo(4.1895f, 22.9707f)
                lineTo(9.1895f, 21.9707f)
                lineTo(9.7207f, 21.8809f)
                lineTo(9.9102f, 21.4102f)
                lineTo(10.3105f, 20.4805f)
                curveTo(10.2105f, 20.4905f, 10.1f, 20.5f, 10.0f, 20.5f)
                curveTo(9.38f, 20.5f, 8.7991f, 20.2704f, 8.3691f, 19.9004f)
                close()
                moveTo(18.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 21.0f)
                close()
                moveTo(2.0f, 25.0f)
                lineTo(2.0f, 27.0f)
                lineTo(30.0f, 27.0f)
                lineTo(30.0f, 25.0f)
                lineTo(2.0f, 25.0f)
                close()
            }
        }
        .build()
        return _diagnosesSolid!!
    }

private var _diagnosesSolid: ImageVector? = null
