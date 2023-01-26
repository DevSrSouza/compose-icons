package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.EditLocationAlt: ImageVector
    get() {
        if (_editLocationAlt != null) {
            return _editLocationAlt!!
        }
        _editLocationAlt = Builder(name = "EditLocationAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.95f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.05f)
                lineToRelative(5.61f, -5.61f)
                curveTo(13.78f, 2.16f, 12.9f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f)
                curveToRelative(0.0f, 3.32f, 2.67f, 7.25f, 8.0f, 11.8f)
                curveToRelative(5.33f, -4.55f, 8.0f, -8.48f, 8.0f, -11.8f)
                curveToRelative(0.0f, -1.01f, -0.16f, -1.94f, -0.45f, -2.8f)
                lineTo(13.95f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                lineToRelative(2.12f, 0.0f)
                lineToRelative(6.16f, -6.16f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-6.16f, 6.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 2.0f)
                lineTo(20.0f, 1.29f)
                curveTo(19.8f, 1.1f, 19.55f, 1.0f, 19.29f, 1.0f)
                curveToRelative(-0.13f, 0.0f, -0.48f, 0.07f, -0.71f, 0.29f)
                lineToRelative(-0.72f, 0.72f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(0.72f, -0.72f)
                curveTo(21.1f, 3.02f, 21.1f, 2.39f, 20.71f, 2.0f)
                close()
            }
        }
        .build()
        return _editLocationAlt!!
    }

private var _editLocationAlt: ImageVector? = null
