package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Square0Filled: ImageVector
    get() {
        if (_square0Filled != null) {
            return _square0Filled!!
        }
        _square0Filled = Builder(name = "Square0Filled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.333f, 2.0f)
                curveToRelative(1.96f, 0.0f, 3.56f, 1.537f, 3.662f, 3.472f)
                lineToRelative(0.005f, 0.195f)
                verticalLineToRelative(12.666f)
                curveToRelative(0.0f, 1.96f, -1.537f, 3.56f, -3.472f, 3.662f)
                lineToRelative(-0.195f, 0.005f)
                horizontalLineToRelative(-12.666f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, -3.662f, -3.472f)
                lineToRelative(-0.005f, -0.195f)
                verticalLineToRelative(-12.666f)
                curveToRelative(0.0f, -1.96f, 1.537f, -3.56f, 3.472f, -3.662f)
                lineToRelative(0.195f, -0.005f)
                horizontalLineToRelative(12.666f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.995f, 2.824f)
                lineToRelative(-0.005f, 0.176f)
                verticalLineToRelative(4.0f)
                lineToRelative(0.005f, 0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 5.99f, 0.0f)
                lineToRelative(0.005f, -0.176f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.995f, -2.824f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(4.0f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.986f, 0.0f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-4.0f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, -0.883f)
                close()
            }
        }
        .build()
        return _square0Filled!!
    }

private var _square0Filled: ImageVector? = null
