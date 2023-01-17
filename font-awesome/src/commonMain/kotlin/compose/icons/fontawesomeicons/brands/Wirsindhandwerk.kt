package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Wirsindhandwerk: ImageVector
    get() {
        if (_wirsindhandwerk != null) {
            return _wirsindhandwerk!!
        }
        _wirsindhandwerk = Builder(name = "Wirsindhandwerk", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.772f, 479.812f)
                horizontalLineToRelative(83.361f)
                lineTo(134.132f, 367.847f)
                lineToRelative(-83.361f, 47.009f)
                close()
                moveTo(379.818f, 479.812f)
                horizontalLineToRelative(82.35f)
                lineTo(462.169f, 414.856f)
                lineToRelative(-82.35f, -47.009f)
                close()
                moveTo(379.824f, 31.812f)
                lineTo(379.824f, 251.568f)
                lineTo(256.176f, 179.186f)
                lineTo(134.504f, 251.568f)
                lineTo(134.504f, 31.812f)
                lineTo(50.772f, 31.812f)
                lineTo(50.772f, 392.606f)
                lineTo(256.176f, 270.319f)
                lineTo(462.169f, 392.606f)
                lineTo(462.169f, 31.812f)
                close()
            }
        }
        .build()
        return _wirsindhandwerk!!
    }

private var _wirsindhandwerk: ImageVector? = null
