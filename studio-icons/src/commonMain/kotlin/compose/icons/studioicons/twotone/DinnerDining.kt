package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.DinnerDining: ImageVector
    get() {
        if (_dinnerDining != null) {
            return _dinnerDining!!
        }
        _dinnerDining = Builder(name = "DinnerDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.08f, 15.14f)
                curveTo(16.41f, 14.4f, 15.49f, 14.0f, 14.5f, 14.0f)
                curveToRelative(-1.35f, 0.0f, -2.58f, 0.79f, -3.16f, 2.0f)
                horizontalLineToRelative(6.32f)
                curveTo(17.52f, 15.69f, 17.32f, 15.4f, 17.08f, 15.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 19.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                horizontalLineToRelative(16.97f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.29f, -3.26f, -2.28f, -6.0f, -5.48f, -6.0f)
                curveToRelative(-2.35f, 0.0f, -4.35f, 1.48f, -5.14f, 3.55f)
                curveTo(8.94f, 15.32f, 8.48f, 15.17f, 8.0f, 15.08f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.75f)
                curveTo(10.99f, 9.0f, 12.0f, 7.99f, 12.0f, 6.75f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-9.0f)
                curveTo(12.0f, 4.01f, 10.99f, 3.0f, 9.75f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.75f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.39f)
                curveTo(3.56f, 16.85f, 3.22f, 17.39f, 3.0f, 18.0f)
                close()
                moveTo(14.5f, 14.0f)
                curveToRelative(0.99f, 0.0f, 1.91f, 0.4f, 2.58f, 1.14f)
                curveToRelative(0.24f, 0.26f, 0.44f, 0.55f, 0.58f, 0.86f)
                horizontalLineToRelative(-6.32f)
                curveTo(11.92f, 14.79f, 13.15f, 14.0f, 14.5f, 14.0f)
                close()
                moveTo(8.0f, 4.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.75f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(8.0f, 6.75f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.75f)
                close()
                moveTo(5.5f, 4.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(5.5f, 6.75f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(6.75f)
                close()
                moveTo(5.5f, 9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.06f)
                curveToRelative(-0.35f, 0.06f, -0.68f, 0.17f, -1.0f, 0.3f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _dinnerDining!!
    }

private var _dinnerDining: ImageVector? = null
