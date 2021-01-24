package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.BreadSlice: ImageVector
    get() {
        if (_breadSlice != null) {
            return _breadSlice!!
        }
        _breadSlice = Builder(name = "BreadSlice", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 0.0f)
                curveTo(108.0f, 0.0f, 0.0f, 93.4f, 0.0f, 169.14f)
                curveTo(0.0f, 199.44f, 24.24f, 224.0f, 64.0f, 224.0f)
                verticalLineToRelative(256.0f)
                curveToRelative(0.0f, 17.67f, 16.12f, 32.0f, 36.0f, 32.0f)
                horizontalLineToRelative(376.0f)
                curveToRelative(19.88f, 0.0f, 36.0f, -14.33f, 36.0f, -32.0f)
                verticalLineTo(224.0f)
                curveToRelative(39.76f, 0.0f, 64.0f, -24.56f, 64.0f, -54.86f)
                curveTo(576.0f, 93.4f, 468.0f, 0.0f, 288.0f, 0.0f)
                close()
            }
        }
        .build()
        return _breadSlice!!
    }

private var _breadSlice: ImageVector? = null
