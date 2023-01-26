package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.AddHomeWork: ImageVector
    get() {
        if (_addHomeWork != null) {
            return _addHomeWork!!
        }
        _addHomeWork = Builder(name = "AddHomeWork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-6.97f)
                lineToRelative(5.0f, -3.57f)
                lineToRelative(5.0f, 3.57f)
                verticalLineToRelative(1.08f)
                curveToRelative(0.57f, -0.59f, 1.25f, -1.07f, 2.0f, -1.42f)
                verticalLineTo(11.0f)
                lineTo(8.0f, 6.0f)
                lineToRelative(-7.0f, 5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.68f)
                curveTo(11.25f, 20.09f, 11.0f, 19.08f, 11.0f, 18.0f)
                verticalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.11f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(1.97f)
                lineToRelative(2.0f, 1.43f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(6.68f)
                curveTo(21.75f, 12.04f, 22.43f, 12.52f, 23.0f, 13.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 18.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveTo(23.0f, 20.76f, 23.0f, 18.0f)
                close()
                moveTo(17.5f, 21.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _addHomeWork!!
    }

private var _addHomeWork: ImageVector? = null
