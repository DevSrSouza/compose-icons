package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.FountainPenTip: ImageVector
    get() {
        if (_fountainPenTip != null) {
            return _fountainPenTip!!
        }
        _fountainPenTip = Builder(name = "FountainPenTip", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.54f, 3.5f)
                lineTo(20.5f, 8.47f)
                lineTo(19.07f, 9.88f)
                lineTo(14.12f, 4.93f)
                lineTo(15.54f, 3.5f)
                moveTo(3.5f, 19.78f)
                lineTo(10.0f, 13.31f)
                curveTo(9.9f, 13.0f, 9.97f, 12.61f, 10.23f, 12.35f)
                curveTo(10.62f, 11.96f, 11.26f, 11.96f, 11.65f, 12.35f)
                curveTo(12.04f, 12.75f, 12.04f, 13.38f, 11.65f, 13.77f)
                curveTo(11.39f, 14.03f, 11.0f, 14.1f, 10.69f, 14.0f)
                lineTo(4.22f, 20.5f)
                lineTo(14.83f, 16.95f)
                lineTo(18.36f, 10.59f)
                lineTo(13.42f, 5.64f)
                lineTo(7.05f, 9.17f)
                lineTo(3.5f, 19.78f)
                close()
            }
        }
        .build()
        return _fountainPenTip!!
    }

private var _fountainPenTip: ImageVector? = null
