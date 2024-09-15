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
                lineTo(14.619f, 13.0f)
                curveTo(12.819f, 13.0f, 11.169f, 13.98f, 10.289f, 15.52f)
                curveTo(10.999f, 15.6f, 11.62f, 15.979f, 12.02f, 16.529f)
                curveTo(12.54f, 15.589f, 13.529f, 15.0f, 14.619f, 15.0f)
                lineTo(17.381f, 15.0f)
                curveTo(17.821f, 15.0f, 18.229f, 15.09f, 18.609f, 15.26f)
                curveTo(18.819f, 14.57f, 19.321f, 14.02f, 19.961f, 13.73f)
                curveTo(19.201f, 13.26f, 18.311f, 13.0f, 17.381f, 13.0f)
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
                moveTo(22.73f, 17.811f)
                curveTo(22.28f, 18.241f, 21.67f, 18.5f, 21.0f, 18.5f)
                curveTo(20.95f, 18.5f, 20.89f, 18.5f, 20.84f, 18.49f)
                lineTo(22.09f, 21.41f)
                lineTo(22.279f, 21.881f)
                lineTo(22.811f, 21.971f)
                lineTo(27.811f, 22.971f)
                lineTo(28.189f, 21.029f)
                lineTo(23.721f, 20.119f)
                lineTo(22.73f, 17.811f)
                close()
                moveTo(15.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 18.0f)
                close()
                moveTo(8.369f, 19.9f)
                lineTo(8.279f, 20.119f)
                lineTo(3.811f, 21.029f)
                lineTo(4.189f, 22.971f)
                lineTo(9.189f, 21.971f)
                lineTo(9.721f, 21.881f)
                lineTo(9.91f, 21.41f)
                lineTo(10.311f, 20.48f)
                curveTo(10.211f, 20.49f, 10.1f, 20.5f, 10.0f, 20.5f)
                curveTo(9.38f, 20.5f, 8.799f, 20.27f, 8.369f, 19.9f)
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
