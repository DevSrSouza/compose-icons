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

public val RoundGroup.AreaChart: ImageVector
    get() {
        if (_areaChart != null) {
            return _areaChart!!
        }
        _areaChart = Builder(name = "AreaChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 17.0f)
                lineToRelative(3.39f, -4.66f)
                curveToRelative(0.33f, -0.46f, 0.98f, -0.55f, 1.42f, -0.2f)
                lineTo(21.0f, 18.5f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineToRelative(0.0f, -5.72f)
                curveToRelative(0.22f, 0.0f, 0.44f, 0.07f, 0.62f, 0.22f)
                lineTo(8.0f, 17.0f)
                close()
                moveTo(3.0f, 11.0f)
                curveToRelative(0.44f, 0.0f, 0.88f, 0.15f, 1.25f, 0.44f)
                lineToRelative(3.37f, 2.69f)
                lineToRelative(2.77f, -3.81f)
                curveToRelative(0.66f, -0.91f, 1.95f, -1.1f, 2.85f, -0.4f)
                lineTo(21.0f, 15.97f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-4.18f, -3.34f)
                curveToRelative(-0.45f, -0.36f, -1.1f, -0.27f, -1.44f, 0.2f)
                lineTo(7.0f, 10.0f)
                lineTo(3.6f, 7.45f)
                curveTo(3.42f, 7.32f, 3.21f, 7.25f, 3.0f, 7.25f)
                lineTo(3.0f, 11.0f)
                close()
            }
        }
        .build()
        return _areaChart!!
    }

private var _areaChart: ImageVector? = null
