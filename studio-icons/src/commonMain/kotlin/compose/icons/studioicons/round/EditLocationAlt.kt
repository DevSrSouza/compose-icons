package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.EditLocationAlt: ImageVector
    get() {
        if (_editLocationAlt != null) {
            return _editLocationAlt!!
        }
        _editLocationAlt = Builder(name = "EditLocationAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.54f, 13.0f)
                horizontalLineTo(10.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(8.46f)
                curveTo(9.0f, 8.2f, 9.11f, 7.94f, 9.29f, 7.76f)
                lineToRelative(5.32f, -5.32f)
                curveTo(13.78f, 2.16f, 12.9f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f)
                curveToRelative(0.0f, 3.18f, 2.44f, 6.92f, 7.33f, 11.22f)
                curveToRelative(0.38f, 0.33f, 0.96f, 0.33f, 1.34f, 0.0f)
                curveTo(17.56f, 17.12f, 20.0f, 13.37f, 20.0f, 10.2f)
                curveToRelative(0.0f, -1.01f, -0.16f, -1.94f, -0.45f, -2.8f)
                lineToRelative(-5.31f, 5.31f)
                curveTo(14.06f, 12.89f, 13.8f, 13.0f, 13.54f, 13.0f)
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
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
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
