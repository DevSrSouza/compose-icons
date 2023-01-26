package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.BrunchDining: ImageVector
    get() {
        if (_brunchDining != null) {
            return _brunchDining!!
        }
        _brunchDining = Builder(name = "BrunchDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(16.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(18.0f, 15.89f)
                lineToRelative(-0.4f, -0.42f)
                curveToRelative(-1.02f, -1.08f, -1.6f, -2.52f, -1.6f, -4.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(9.51f)
                curveToRelative(0.0f, 1.46f, -0.54f, 2.87f, -1.53f, 3.94f)
                lineTo(20.0f, 15.97f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(15.89f)
                close()
                moveTo(7.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _brunchDining!!
    }

private var _brunchDining: ImageVector? = null
