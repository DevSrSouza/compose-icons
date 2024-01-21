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

public val SimpleIcons.Graphql: ImageVector
    get() {
        if (_graphql != null) {
            return _graphql!!
        }
        _graphql = Builder(name = "Graphql", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.002f, 0.0f)
                arcToRelative(2.138f, 2.138f, 0.0f, true, false, 0.0f, 4.277f)
                arcToRelative(2.138f, 2.138f, 0.0f, true, false, 0.0f, -4.277f)
                close()
                moveTo(20.542f, 4.931f)
                arcToRelative(2.138f, 2.138f, 0.0f, true, false, 0.0f, 4.277f)
                arcToRelative(2.138f, 2.138f, 0.0f, true, false, 0.0f, -4.277f)
                close()
                moveTo(20.542f, 14.793f)
                arcToRelative(2.138f, 2.138f, 0.0f, true, false, 0.0f, 4.277f)
                arcToRelative(2.138f, 2.138f, 0.0f, true, false, 0.0f, -4.277f)
                close()
                moveTo(12.002f, 19.724f)
                arcToRelative(2.138f, 2.138f, 0.0f, true, false, 0.0f, 4.276f)
                arcToRelative(2.138f, 2.138f, 0.0f, true, false, 0.0f, -4.276f)
                close()
                moveTo(3.46f, 14.794f)
                arcToRelative(2.138f, 2.138f, 0.0f, true, false, 0.0f, 4.276f)
                arcToRelative(2.138f, 2.138f, 0.0f, true, false, 0.0f, -4.277f)
                close()
                moveTo(3.46f, 4.931f)
                arcToRelative(2.138f, 2.138f, 0.0f, true, false, 0.0f, 4.277f)
                arcToRelative(2.138f, 2.138f, 0.0f, true, false, 0.0f, -4.277f)
                close()
                moveTo(12.002f, 1.553f)
                lineTo(2.953f, 6.777f)
                verticalLineToRelative(10.448f)
                lineToRelative(9.049f, 5.224f)
                lineToRelative(9.047f, -5.224f)
                lineTo(21.049f, 6.777f)
                close()
                moveTo(12.002f, 3.154f)
                lineTo(19.662f, 16.424f)
                lineTo(4.34f, 16.424f)
                close()
                moveTo(10.615f, 3.525f)
                lineTo(3.97f, 15.037f)
                lineTo(3.97f, 7.363f)
                close()
                moveTo(13.389f, 3.525f)
                lineTo(20.035f, 7.363f)
                verticalLineToRelative(7.674f)
                close()
                moveTo(5.355f, 17.44f)
                horizontalLineToRelative(13.293f)
                lineToRelative(-6.646f, 3.836f)
                close()
            }
        }
        .build()
        return _graphql!!
    }

private var _graphql: ImageVector? = null
