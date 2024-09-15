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

public val LineAwesomeIcons.HandMiddleFingerSolid: ImageVector
    get() {
        if (_handMiddleFingerSolid != null) {
            return _handMiddleFingerSolid!!
        }
        _handMiddleFingerSolid = Builder(name = "HandMiddleFingerSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(14.355f, 2.0f, 13.0f, 3.355f, 13.0f, 5.0f)
                lineTo(13.0f, 10.188f)
                curveTo(12.684f, 10.074f, 12.352f, 10.0f, 12.0f, 10.0f)
                curveTo(10.355f, 10.0f, 9.0f, 11.355f, 9.0f, 13.0f)
                lineTo(9.0f, 16.656f)
                lineTo(6.906f, 19.344f)
                curveTo(5.629f, 20.996f, 5.715f, 23.367f, 7.094f, 24.938f)
                lineTo(9.469f, 27.625f)
                curveTo(10.797f, 29.137f, 12.707f, 30.0f, 14.719f, 30.0f)
                lineTo(20.0f, 30.0f)
                curveTo(23.855f, 30.0f, 27.0f, 26.855f, 27.0f, 23.0f)
                lineTo(27.0f, 14.0f)
                curveTo(27.0f, 12.355f, 25.645f, 11.0f, 24.0f, 11.0f)
                curveTo(23.465f, 11.0f, 22.969f, 11.156f, 22.531f, 11.406f)
                curveTo(21.996f, 10.563f, 21.063f, 10.0f, 20.0f, 10.0f)
                curveTo(19.648f, 10.0f, 19.316f, 10.074f, 19.0f, 10.188f)
                lineTo(19.0f, 5.0f)
                curveTo(19.0f, 3.355f, 17.645f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(16.566f, 4.0f, 17.0f, 4.434f, 17.0f, 5.0f)
                lineTo(17.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                lineTo(19.0f, 13.0f)
                curveTo(19.0f, 12.434f, 19.434f, 12.0f, 20.0f, 12.0f)
                curveTo(20.566f, 12.0f, 21.0f, 12.434f, 21.0f, 13.0f)
                lineTo(21.0f, 15.0f)
                lineTo(23.0f, 15.0f)
                lineTo(23.0f, 14.0f)
                curveTo(23.0f, 13.434f, 23.434f, 13.0f, 24.0f, 13.0f)
                curveTo(24.566f, 13.0f, 25.0f, 13.434f, 25.0f, 14.0f)
                lineTo(25.0f, 23.0f)
                curveTo(25.0f, 25.773f, 22.773f, 28.0f, 20.0f, 28.0f)
                lineTo(14.719f, 28.0f)
                curveTo(13.281f, 28.0f, 11.918f, 27.395f, 10.969f, 26.313f)
                lineTo(8.594f, 23.594f)
                curveTo(7.84f, 22.734f, 7.801f, 21.5f, 8.5f, 20.594f)
                lineTo(9.0f, 19.938f)
                lineTo(9.0f, 21.0f)
                lineTo(11.0f, 21.0f)
                lineTo(11.0f, 13.0f)
                curveTo(11.0f, 12.434f, 11.434f, 12.0f, 12.0f, 12.0f)
                curveTo(12.566f, 12.0f, 13.0f, 12.434f, 13.0f, 13.0f)
                lineTo(13.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 5.0f)
                curveTo(15.0f, 4.434f, 15.434f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _handMiddleFingerSolid!!
    }

private var _handMiddleFingerSolid: ImageVector? = null
