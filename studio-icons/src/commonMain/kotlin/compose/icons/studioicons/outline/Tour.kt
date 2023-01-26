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

public val OutlineGroup.Tour: ImageVector
    get() {
        if (_tour != null) {
            return _tour!!
        }
        _tour = Builder(name = "Tour", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                horizontalLineToRelative(9.0f)
                lineToRelative(-2.0f, -5.0f)
                lineTo(21.0f, 4.0f)
                close()
                moveTo(17.14f, 9.74f)
                lineToRelative(0.9f, 2.26f)
                horizontalLineTo(12.0f)
                horizontalLineToRelative(-1.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                horizontalLineToRelative(5.05f)
                lineToRelative(-0.9f, 2.26f)
                lineTo(16.85f, 9.0f)
                lineTo(17.14f, 9.74f)
                close()
                moveTo(14.0f, 9.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveTo(14.0f, 7.9f, 14.0f, 9.0f)
                close()
            }
        }
        .build()
        return _tour!!
    }

private var _tour: ImageVector? = null
