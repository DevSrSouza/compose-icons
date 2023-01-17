package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Hourglass24: ImageVector
    get() {
        if (_hourglass24 != null) {
            return _hourglass24!!
        }
        _hourglass24 = Builder(name = "Hourglass24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 2.0f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(2.982f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -2.215f, 4.017f)
                lineToRelative(-2.044f, 1.29f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, 0.422f)
                lineToRelative(2.044f, 1.29f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 2.215f, 4.017f)
                verticalLineTo(20.5f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-2.982f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 2.215f, -4.017f)
                lineToRelative(2.044f, -1.29f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.422f)
                lineToRelative(-2.044f, -1.29f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 5.5f, 6.482f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(17.0f, 3.5f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.982f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 8.516f, 9.23f)
                lineToRelative(2.044f, 1.29f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, 2.96f)
                lineToRelative(-2.044f, 1.29f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 7.0f, 17.518f)
                verticalLineTo(20.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.982f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -1.516f, -2.748f)
                lineToRelative(-2.044f, -1.29f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, -2.96f)
                lineToRelative(2.044f, -1.29f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 17.0f, 6.482f)
                close()
            }
        }
        .build()
        return _hourglass24!!
    }

private var _hourglass24: ImageVector? = null
