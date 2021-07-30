package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Shutterstock: ImageVector
    get() {
        if (_shutterstock != null) {
            return _shutterstock!!
        }
        _shutterstock = Builder(name = "Shutterstock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.839f, 18.761f)
                horizontalLineToRelative(5.313f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, false, 1.527f, -1.528f)
                verticalLineToRelative(-5.76f)
                horizontalLineToRelative(5.237f)
                verticalLineToRelative(5.76f)
                arcTo(6.767f, 6.767f, 0.0f, false, true, 15.152f, 24.0f)
                horizontalLineTo(9.839f)
                verticalLineToRelative(-5.239f)
                moveTo(14.16f, 5.237f)
                horizontalLineTo(8.85f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, false, -1.53f, 1.527f)
                verticalLineToRelative(5.761f)
                horizontalLineTo(2.085f)
                verticalLineTo(6.764f)
                arcTo(6.763f, 6.763f, 0.0f, false, true, 8.85f, 0.0f)
                horizontalLineToRelative(5.31f)
                verticalLineToRelative(5.237f)
                close()
            }
        }
        .build()
        return _shutterstock!!
    }

private var _shutterstock: ImageVector? = null
