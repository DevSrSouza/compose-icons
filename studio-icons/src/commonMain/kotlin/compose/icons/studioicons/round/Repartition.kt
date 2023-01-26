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

public val RoundGroup.Repartition: ImageVector
    get() {
        if (_repartition != null) {
            return _repartition!!
        }
        _repartition = Builder(name = "Repartition", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 21.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-15.0f)
                curveTo(3.67f, 15.0f, 3.0f, 15.67f, 3.0f, 16.5f)
                verticalLineToRelative(3.0f)
                curveTo(3.0f, 20.33f, 3.67f, 21.0f, 4.5f, 21.0f)
                close()
                moveTo(10.33f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.33f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(10.33f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-3.33f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(3.33f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.71f, 9.29f)
                lineTo(6.71f, 9.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f)
                lineTo(5.83f, 7.0f)
                lineToRelative(11.06f, 0.0f)
                curveToRelative(1.0f, 0.0f, 1.92f, 0.68f, 2.08f, 1.66f)
                curveTo(19.18f, 9.91f, 18.21f, 11.0f, 17.0f, 11.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                lineToRelative(12.82f, 0.0f)
                curveToRelative(2.09f, 0.0f, 3.96f, -1.52f, 4.16f, -3.6f)
                curveTo(21.21f, 7.02f, 19.34f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(5.83f)
                lineToRelative(0.88f, -0.88f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineTo(2.71f, 5.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.59f, 2.59f)
                curveTo(5.68f, 9.68f, 6.32f, 9.68f, 6.71f, 9.29f)
                close()
            }
        }
        .build()
        return _repartition!!
    }

private var _repartition: ImageVector? = null
