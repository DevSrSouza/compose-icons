package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.MultilineChart: ImageVector
    get() {
        if (_multilineChart != null) {
            return _multilineChart!!
        }
        _multilineChart = Builder(name = "MultilineChart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.92f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.85f, 3.21f)
                curveTo(15.68f, 6.4f, 12.83f, 5.0f, 9.61f, 5.0f)
                curveTo(6.72f, 5.0f, 4.07f, 6.16f, 2.0f, 8.0f)
                lineToRelative(1.42f, 1.42f)
                curveTo(5.12f, 7.93f, 7.27f, 7.0f, 9.61f, 7.0f)
                curveToRelative(2.74f, 0.0f, 5.09f, 1.26f, 6.77f, 3.24f)
                lineToRelative(-2.88f, 3.24f)
                lineToRelative(-4.0f, -4.0f)
                lineTo(2.0f, 16.99f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(6.0f, -6.01f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.05f, -4.55f)
                curveToRelative(0.75f, 1.35f, 1.25f, 2.9f, 1.44f, 4.55f)
                horizontalLineTo(21.0f)
                curveToRelative(-0.22f, -2.3f, -0.95f, -4.39f, -2.04f, -6.14f)
                lineTo(22.0f, 6.92f)
                close()
            }
        }
        .build()
        return _multilineChart!!
    }

private var _multilineChart: ImageVector? = null
