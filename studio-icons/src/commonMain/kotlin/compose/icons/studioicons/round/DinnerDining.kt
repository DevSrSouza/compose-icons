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

public val RoundGroup.DinnerDining: ImageVector
    get() {
        if (_dinnerDining != null) {
            return _dinnerDining!!
        }
        _dinnerDining = Builder(name = "DinnerDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.85f, 19.85f)
                lineToRelative(1.0f, 1.0f)
                curveTo(3.95f, 20.95f, 4.07f, 21.0f, 4.21f, 21.0f)
                horizontalLineToRelative(15.59f)
                curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(1.0f, -1.0f)
                curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f)
                horizontalLineTo(3.21f)
                curveTo(2.76f, 19.0f, 2.54f, 19.54f, 2.85f, 19.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                lineToRelative(16.97f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.29f, -3.26f, -2.28f, -6.0f, -5.48f, -6.0f)
                curveToRelative(-2.35f, 0.0f, -4.35f, 1.48f, -5.14f, 3.55f)
                curveTo(8.94f, 15.32f, 8.48f, 15.17f, 8.0f, 15.08f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.75f)
                curveTo(10.99f, 9.0f, 12.0f, 7.99f, 12.0f, 6.75f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(8.25f)
                curveTo(20.66f, 6.75f, 21.0f, 6.41f, 21.0f, 6.0f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(0.0f)
                curveTo(12.0f, 4.01f, 10.99f, 3.0f, 9.75f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveTo(3.34f, 3.0f, 3.0f, 3.34f, 3.0f, 3.75f)
                reflectiveCurveTo(3.34f, 4.5f, 3.75f, 4.5f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(0.75f)
                horizontalLineTo(3.75f)
                curveTo(3.34f, 5.25f, 3.0f, 5.59f, 3.0f, 6.0f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(3.75f)
                curveTo(3.34f, 7.5f, 3.0f, 7.84f, 3.0f, 8.25f)
                reflectiveCurveTo(3.34f, 9.0f, 3.75f, 9.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(7.39f)
                curveTo(3.56f, 16.85f, 3.22f, 17.39f, 3.0f, 18.0f)
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
