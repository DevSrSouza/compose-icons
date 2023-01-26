package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SsidChart: ImageVector
    get() {
        if (_ssidChart != null) {
            return _ssidChart!!
        }
        _ssidChart = Builder(name = "SsidChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 9.03f)
                curveToRelative(0.0f, -0.32f, 0.15f, -0.62f, 0.41f, -0.81f)
                lineTo(7.14f, 5.5f)
                curveToRelative(0.4f, -0.29f, 0.95f, -0.25f, 1.3f, 0.1f)
                lineToRelative(3.78f, 3.78f)
                lineToRelative(7.2f, -5.23f)
                curveTo(20.07f, 3.67f, 21.0f, 4.14f, 21.0f, 4.96f)
                curveToRelative(0.0f, 0.32f, -0.15f, 0.62f, -0.41f, 0.81f)
                lineToRelative(-7.9f, 5.73f)
                curveToRelative(-0.4f, 0.29f, -0.95f, 0.25f, -1.29f, -0.1f)
                lineTo(7.62f, 7.62f)
                lineTo(4.59f, 9.84f)
                curveTo(3.93f, 10.32f, 3.0f, 9.85f, 3.0f, 9.03f)
                close()
                moveTo(21.0f, 16.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.35f)
                curveToRelative(-0.23f, 0.0f, -0.45f, 0.08f, -0.62f, 0.22f)
                lineToRelative(-3.9f, 3.12f)
                lineTo(6.6f, 12.99f)
                curveToRelative(-0.35f, -0.34f, -0.88f, -0.38f, -1.27f, -0.1f)
                lineToRelative(-1.9f, 1.35f)
                curveTo(3.16f, 14.43f, 3.0f, 14.74f, 3.0f, 15.06f)
                curveToRelative(0.0f, 0.81f, 0.92f, 1.29f, 1.58f, 0.81f)
                lineTo(5.8f, 15.0f)
                lineToRelative(5.57f, 5.39f)
                curveToRelative(0.36f, 0.35f, 0.93f, 0.38f, 1.32f, 0.06f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                curveTo(20.55f, 17.0f, 21.0f, 16.55f, 21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _ssidChart!!
    }

private var _ssidChart: ImageVector? = null
