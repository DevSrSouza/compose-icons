package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Ardour: ImageVector
    get() {
        if (_ardour != null) {
            return _ardour!!
        }
        _ardour = Builder(name = "Ardour", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.606f)
                lineTo(0.0f, 22.394f)
                curveToRelative(1.45f, 0.0f, 0.832f, -0.885f, 1.565f, -0.93f)
                curveToRelative(0.703f, 0.0f, 0.559f, 0.44f, 1.044f, 0.44f)
                curveToRelative(0.846f, 0.0f, 0.273f, -2.82f, 1.043f, -2.82f)
                curveToRelative(0.665f, 0.0f, 0.48f, 2.038f, 1.044f, 2.038f)
                curveToRelative(0.288f, 0.0f, 0.521f, -0.811f, 0.521f, -1.81f)
                verticalLineToRelative(-0.945f)
                curveToRelative(0.0f, -1.304f, 0.234f, -2.364f, 0.522f, -2.364f)
                curveToRelative(0.288f, 0.0f, 0.522f, 1.066f, 0.522f, 2.005f)
                curveToRelative(0.0f, 1.178f, 0.233f, 2.43f, 0.522f, 2.43f)
                curveToRelative(0.288f, 0.0f, 0.521f, -1.263f, 0.521f, -2.805f)
                verticalLineToRelative(-0.44f)
                curveToRelative(0.0f, -1.69f, 0.234f, -3.065f, 0.522f, -3.065f)
                curveToRelative(0.288f, 0.0f, 0.522f, 1.369f, 0.522f, 2.967f)
                curveToRelative(0.0f, 1.661f, 0.233f, 3.098f, 0.522f, 3.098f)
                curveToRelative(0.288f, 0.0f, 0.521f, -1.437f, 0.521f, -3.18f)
                curveToRelative(0.0f, -1.737f, 0.234f, -3.146f, 0.522f, -3.146f)
                curveToRelative(0.288f, 0.0f, 0.522f, 1.424f, 0.522f, 3.277f)
                curveToRelative(0.0f, 1.786f, 0.233f, 3.147f, 0.522f, 3.147f)
                curveToRelative(0.288f, 0.0f, 0.521f, -1.367f, 0.521f, -2.87f)
                curveToRelative(0.0f, -1.386f, 0.234f, -2.657f, 0.522f, -2.657f)
                curveToRelative(0.288f, 0.0f, 0.522f, 1.271f, 0.522f, 2.837f)
                verticalLineToRelative(0.472f)
                curveToRelative(0.0f, 1.415f, 0.233f, 2.56f, 0.521f, 2.56f)
                curveToRelative(0.289f, 0.0f, 0.522f, -1.152f, 0.522f, -2.299f)
                curveToRelative(0.0f, -0.973f, 0.234f, -1.989f, 0.522f, -1.989f)
                curveToRelative(0.288f, 0.0f, 0.522f, 1.01f, 0.522f, 2.25f)
                verticalLineToRelative(0.57f)
                curveToRelative(0.0f, 1.058f, 0.233f, 1.908f, 0.521f, 1.908f)
                curveToRelative(0.289f, 0.0f, 0.522f, -0.84f, 0.522f, -1.614f)
                curveToRelative(0.0f, -0.589f, 0.234f, -1.304f, 0.522f, -1.304f)
                curveToRelative(0.288f, 0.0f, 0.522f, 0.709f, 0.522f, 1.581f)
                verticalLineToRelative(0.538f)
                curveToRelative(0.0f, 0.696f, 0.233f, 1.272f, 0.521f, 1.272f)
                curveToRelative(0.595f, 0.0f, 0.45f, -1.728f, 1.044f, -1.728f)
                curveToRelative(0.288f, 0.0f, 0.522f, 0.43f, 0.522f, 0.962f)
                verticalLineToRelative(0.456f)
                curveToRelative(0.0f, 0.385f, 0.233f, 0.685f, 0.521f, 0.685f)
                curveToRelative(0.59f, 0.0f, 0.462f, -0.782f, 1.044f, -0.782f)
                curveToRelative(0.76f, 0.0f, 0.197f, 1.076f, 1.043f, 1.076f)
                curveToRelative(0.512f, 0.0f, 0.426f, -0.18f, 1.044f, -0.18f)
                curveToRelative(0.563f, 0.0f, 0.493f, 0.359f, 1.565f, 0.359f)
                close()
            }
        }
        .build()
        return _ardour!!
    }

private var _ardour: ImageVector? = null
