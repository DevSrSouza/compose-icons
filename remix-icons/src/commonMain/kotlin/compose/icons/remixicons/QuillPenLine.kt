package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.QuillPenLine: ImageVector
    get() {
        if (_quillPenLine != null) {
            return _quillPenLine!!
        }
        _quillPenLine = Builder(name = "QuillPenLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.94f, 14.036f)
                curveToRelative(-0.233f, 0.624f, -0.43f, 1.2f, -0.606f, 1.783f)
                curveToRelative(0.96f, -0.697f, 2.101f, -1.139f, 3.418f, -1.304f)
                curveToRelative(2.513f, -0.314f, 4.746f, -1.973f, 5.876f, -4.058f)
                lineToRelative(-1.456f, -1.455f)
                lineToRelative(1.413f, -1.415f)
                lineToRelative(1.0f, -1.001f)
                curveToRelative(0.43f, -0.43f, 0.915f, -1.224f, 1.428f, -2.368f)
                curveToRelative(-5.593f, 0.867f, -9.018f, 4.292f, -11.074f, 9.818f)
                close()
                moveTo(17.0f, 9.001f)
                lineTo(18.0f, 10.0f)
                curveToRelative(-1.0f, 3.0f, -4.0f, 6.0f, -8.0f, 6.5f)
                curveToRelative(-2.669f, 0.334f, -4.336f, 2.167f, -5.002f, 5.5f)
                horizontalLineTo(3.0f)
                curveTo(4.0f, 16.0f, 6.0f, 2.0f, 21.0f, 2.0f)
                curveToRelative(-1.0f, 2.997f, -1.998f, 4.996f, -2.997f, 5.997f)
                lineTo(17.0f, 9.001f)
                close()
            }
        }
        .build()
        return _quillPenLine!!
    }

private var _quillPenLine: ImageVector? = null
