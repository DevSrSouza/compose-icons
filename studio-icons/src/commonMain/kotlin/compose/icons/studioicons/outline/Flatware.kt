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

public val OutlineGroup.Flatware: ImageVector
    get() {
        if (_flatware != null) {
            return _flatware!!
        }
        _flatware = Builder(name = "Flatware", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.08f)
                curveToRelative(0.0f, 1.77f, -0.84f, 3.25f, -2.0f, 3.82f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(10.9f)
                curveToRelative(-1.16f, -0.57f, -2.0f, -2.05f, -2.0f, -3.82f)
                curveTo(10.01f, 4.83f, 11.35f, 3.0f, 13.0f, 3.0f)
                curveTo(14.66f, 3.0f, 16.0f, 4.83f, 16.0f, 7.08f)
                close()
                moveTo(17.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 5.24f, 19.76f, 3.0f, 17.0f, 3.0f)
                close()
                moveTo(8.28f, 3.0f)
                curveToRelative(-0.4f, 0.0f, -0.72f, 0.32f, -0.72f, 0.72f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.72f)
                verticalLineTo(3.72f)
                curveTo(6.72f, 3.32f, 6.4f, 3.0f, 6.0f, 3.0f)
                reflectiveCurveTo(5.28f, 3.32f, 5.28f, 3.72f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.44f)
                verticalLineTo(3.72f)
                curveTo(4.44f, 3.32f, 4.12f, 3.0f, 3.72f, 3.0f)
                reflectiveCurveTo(3.0f, 3.32f, 3.0f, 3.72f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(11.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(3.72f)
                curveTo(9.0f, 3.32f, 8.68f, 3.0f, 8.28f, 3.0f)
                close()
            }
        }
        .build()
        return _flatware!!
    }

private var _flatware: ImageVector? = null
