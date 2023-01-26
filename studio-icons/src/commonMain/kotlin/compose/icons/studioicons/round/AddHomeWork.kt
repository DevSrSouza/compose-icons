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

public val RoundGroup.AddHomeWork: ImageVector
    get() {
        if (_addHomeWork != null) {
            return _addHomeWork!!
        }
        _addHomeWork = Builder(name = "AddHomeWork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.96f, 11.7f)
                curveToRelative(-0.09f, -0.52f, -0.36f, -0.99f, -0.8f, -1.3f)
                lineToRelative(-5.0f, -3.57f)
                curveToRelative(-0.7f, -0.5f, -1.63f, -0.5f, -2.32f, 0.0f)
                lineToRelative(-5.0f, 3.57f)
                curveTo(1.31f, 10.78f, 1.0f, 11.38f, 1.0f, 12.03f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.68f)
                curveTo(11.25f, 20.09f, 11.0f, 19.08f, 11.0f, 18.0f)
                curveTo(11.0f, 15.22f, 12.62f, 12.83f, 14.96f, 11.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.11f)
                verticalLineTo(4.97f)
                curveTo(23.0f, 3.88f, 22.12f, 3.0f, 21.03f, 3.0f)
                horizontalLineToRelative(-9.06f)
                curveTo(10.88f, 3.0f, 10.0f, 3.88f, 10.0f, 4.97f)
                lineToRelative(0.02f, 0.05f)
                curveToRelative(0.1f, 0.06f, 0.21f, 0.11f, 0.3f, 0.18f)
                lineToRelative(5.0f, 3.57f)
                curveToRelative(0.79f, 0.56f, 1.34f, 1.4f, 1.56f, 2.32f)
                curveTo(17.25f, 11.04f, 17.62f, 11.0f, 18.0f, 11.0f)
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
