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

public val OutlineGroup.EditOff: ImageVector
    get() {
        if (_editOff != null) {
            return _editOff!!
        }
        _editOff = Builder(name = "EditOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.06f, 9.02f)
                lineToRelative(0.92f, 0.92f)
                lineToRelative(-1.11f, 1.11f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.52f, -2.52f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-2.52f, 2.52f)
                lineToRelative(1.41f, 1.41f)
                lineTo(14.06f, 9.02f)
                close()
                moveTo(20.71f, 7.04f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-2.34f, -2.34f)
                curveTo(18.17f, 3.09f, 17.92f, 3.0f, 17.66f, 3.0f)
                reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f)
                lineToRelative(-1.83f, 1.83f)
                lineToRelative(3.75f, 3.75f)
                lineTo(20.71f, 7.04f)
                close()
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(7.32f, 7.32f)
                lineTo(3.0f, 17.25f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(3.75f)
                lineToRelative(5.71f, -5.71f)
                lineToRelative(7.32f, 7.32f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(5.92f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-0.92f)
                lineToRelative(5.13f, -5.13f)
                lineToRelative(0.92f, 0.92f)
                lineTo(5.92f, 19.0f)
                close()
            }
        }
        .build()
        return _editOff!!
    }

private var _editOff: ImageVector? = null
