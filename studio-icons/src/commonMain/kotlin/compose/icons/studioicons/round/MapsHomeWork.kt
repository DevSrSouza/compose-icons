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

public val RoundGroup.MapsHomeWork: ImageVector
    get() {
        if (_mapsHomeWork != null) {
            return _mapsHomeWork!!
        }
        _mapsHomeWork = Builder(name = "MapsHomeWork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.16f, 10.4f)
                lineToRelative(-5.0f, -3.57f)
                curveToRelative(-0.7f, -0.5f, -1.63f, -0.5f, -2.32f, 0.0f)
                lineToRelative(-5.0f, 3.57f)
                curveTo(1.31f, 10.78f, 1.0f, 11.38f, 1.0f, 12.03f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-7.97f)
                curveTo(15.0f, 11.38f, 14.69f, 10.78f, 14.16f, 10.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.03f, 3.0f)
                horizontalLineToRelative(-9.06f)
                curveTo(10.88f, 3.0f, 10.0f, 3.88f, 10.0f, 4.97f)
                lineToRelative(0.09f, 0.09f)
                curveToRelative(0.08f, 0.05f, 0.16f, 0.09f, 0.24f, 0.14f)
                lineToRelative(5.0f, 3.57f)
                curveToRelative(0.76f, 0.54f, 1.3f, 1.34f, 1.54f, 2.23f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.03f)
                curveToRelative(1.09f, 0.0f, 1.97f, -0.88f, 1.97f, -1.97f)
                verticalLineTo(4.97f)
                curveTo(23.0f, 3.88f, 22.12f, 3.0f, 21.03f, 3.0f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _mapsHomeWork!!
    }

private var _mapsHomeWork: ImageVector? = null
