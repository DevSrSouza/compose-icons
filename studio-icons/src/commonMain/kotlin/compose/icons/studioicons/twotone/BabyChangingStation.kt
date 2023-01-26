package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.BabyChangingStation: ImageVector
    get() {
        if (_babyChangingStation != null) {
            return _babyChangingStation!!
        }
        _babyChangingStation = Builder(name = "BabyChangingStation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(8.31f, 8.82f)
                lineTo(7.0f, 12.75f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                lineToRelative(1.58f, -4.63f)
                curveTo(4.96f, 6.25f, 6.22f, 5.69f, 7.3f, 6.18f)
                lineToRelative(4.15f, 1.83f)
                lineTo(14.0f, 8.0f)
                close()
                moveTo(8.0f, 1.0f)
                curveTo(6.9f, 1.0f, 6.0f, 1.9f, 6.0f, 3.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(9.1f, 1.0f, 8.0f, 1.0f)
                close()
                moveTo(9.0f, 19.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.5f, 16.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(18.0f, 13.67f, 18.0f, 14.5f)
                curveTo(18.0f, 15.33f, 18.67f, 16.0f, 19.5f, 16.0f)
                close()
                moveTo(13.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _babyChangingStation!!
    }

private var _babyChangingStation: ImageVector? = null
