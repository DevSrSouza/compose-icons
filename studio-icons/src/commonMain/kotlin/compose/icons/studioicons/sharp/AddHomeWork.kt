package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.AddHomeWork: ImageVector
    get() {
        if (_addHomeWork != null) {
            return _addHomeWork!!
        }
        _addHomeWork = Builder(name = "AddHomeWork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 11.68f)
                verticalLineTo(11.0f)
                lineTo(8.0f, 6.0f)
                lineToRelative(-7.0f, 5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.68f)
                curveTo(11.25f, 20.09f, 11.0f, 19.08f, 11.0f, 18.0f)
                curveTo(11.0f, 15.21f, 12.64f, 12.81f, 15.0f, 11.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.11f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(1.97f)
                lineToRelative(7.0f, 5.0f)
                verticalLineToRelative(1.11f)
                curveToRelative(0.33f, -0.05f, 0.66f, -0.08f, 1.0f, -0.08f)
                curveTo(19.96f, 11.0f, 21.73f, 11.81f, 23.0f, 13.11f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.0f)
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
