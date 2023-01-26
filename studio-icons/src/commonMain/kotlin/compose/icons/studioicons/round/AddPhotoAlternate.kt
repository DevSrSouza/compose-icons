package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.AddPhotoAlternate: ImageVector
    get() {
        if (_addPhotoAlternate != null) {
            return _addPhotoAlternate!!
        }
        _addPhotoAlternate = Builder(name = "AddPhotoAlternate", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.02f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(2.98f)
                curveToRelative(0.0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.98f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.01f)
                curveToRelative(-0.54f, 0.0f, -0.98f, 0.44f, -0.99f, 0.98f)
                verticalLineToRelative(0.03f)
                curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(2.01f)
                curveToRelative(0.0f, 0.54f, 0.44f, 0.99f, 0.99f, 0.98f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.54f, 0.0f, 0.98f, -0.44f, 0.98f, -0.98f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.54f, 0.0f, 0.98f, -0.44f, 0.98f, -0.98f)
                verticalLineToRelative(-0.04f)
                curveToRelative(0.0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f)
                close()
                moveTo(16.0f, 9.01f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-1.01f)
                curveToRelative(-0.53f, 0.0f, -1.03f, -0.21f, -1.41f, -0.58f)
                curveToRelative(-0.37f, -0.38f, -0.58f, -0.88f, -0.58f, -1.44f)
                curveToRelative(0.0f, -0.36f, 0.1f, -0.69f, 0.27f, -0.98f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-8.28f)
                curveToRelative(-0.3f, 0.17f, -0.64f, 0.28f, -1.02f, 0.28f)
                curveToRelative(-1.09f, -0.01f, -1.98f, -0.9f, -1.98f, -1.99f)
                close()
                moveTo(15.96f, 19.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.41f, 0.0f, -0.65f, -0.47f, -0.4f, -0.8f)
                lineToRelative(1.98f, -2.63f)
                curveToRelative(0.21f, -0.28f, 0.62f, -0.26f, 0.82f, 0.02f)
                lineTo(10.0f, 18.0f)
                lineToRelative(2.61f, -3.48f)
                curveToRelative(0.2f, -0.26f, 0.59f, -0.27f, 0.79f, -0.01f)
                lineToRelative(2.95f, 3.68f)
                curveToRelative(0.26f, 0.33f, 0.03f, 0.81f, -0.39f, 0.81f)
                close()
            }
        }
        .build()
        return _addPhotoAlternate!!
    }

private var _addPhotoAlternate: ImageVector? = null
