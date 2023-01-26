package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.BreakfastDining: ImageVector
    get() {
        if (_breakfastDining != null) {
            return _breakfastDining!!
        }
        _breakfastDining = Builder(name = "BreakfastDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(3.79f, 3.0f, 2.0f, 4.79f, 2.0f, 7.0f)
                curveToRelative(0.0f, 1.48f, 0.81f, 2.75f, 2.0f, 3.45f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-8.55f)
                curveToRelative(1.19f, -0.69f, 2.0f, -1.97f, 2.0f, -3.45f)
                curveTo(22.0f, 4.79f, 20.21f, 3.0f, 18.0f, 3.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _breakfastDining!!
    }

private var _breakfastDining: ImageVector? = null
