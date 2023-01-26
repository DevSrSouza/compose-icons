package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.NoteAlt: ImageVector
    get() {
        if (_noteAlt != null) {
            return _noteAlt!!
        }
        _noteAlt = Builder(name = "NoteAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-4.18f)
                curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(12.0f, 2.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                reflectiveCurveTo(12.41f, 4.25f, 12.0f, 4.25f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveTo(11.59f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(9.1f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.14f)
                lineToRelative(5.96f, -5.96f)
                lineToRelative(2.12f, 2.12f)
                lineTo(9.1f, 17.0f)
                close()
                moveTo(16.85f, 9.27f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.06f, -1.06f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f)
                lineToRelative(1.41f, 1.41f)
                curveTo(17.05f, 8.76f, 17.05f, 9.07f, 16.85f, 9.27f)
                close()
            }
        }
        .build()
        return _noteAlt!!
    }

private var _noteAlt: ImageVector? = null
