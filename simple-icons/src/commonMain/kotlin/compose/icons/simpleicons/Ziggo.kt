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

public val SimpleIcons.Ziggo: ImageVector
    get() {
        if (_ziggo != null) {
            return _ziggo!!
        }
        _ziggo = Builder(name = "Ziggo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.555f, 18.69f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.52f, -2.865f)
                horizontalLineToRelative(-6.3f)
                lineToRelative(7.26f, -6.945f)
                arcToRelative(2.145f, 2.145f, 0.0f, false, false, 0.495f, -2.34f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -2.205f, -1.23f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(2.79f, 2.79f, 0.0f, false, false, 2.19f, 2.895f)
                horizontalLineToRelative(5.175f)
                lineTo(6.0f, 15.375f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, -0.42f, 2.13f)
                arcToRelative(1.965f, 1.965f, 0.0f, false, false, 2.115f, 1.185f)
                close()
                moveTo(2.85f, 18.6f)
                arcToRelative(2.535f, 2.535f, 0.0f, false, false, 2.55f, 2.535f)
                horizontalLineToRelative(13.2f)
                arcToRelative(2.536f, 2.537f, 0.0f, false, false, 2.55f, -2.535f)
                verticalLineTo(7.92f)
                arcTo(2.865f, 2.865f, 0.0f, false, true, 24.0f, 5.31f)
                verticalLineTo(18.6f)
                arcToRelative(5.385f, 5.385f, 0.0f, false, true, -5.4f, 5.4f)
                horizontalLineTo(5.4f)
                arcTo(5.385f, 5.385f, 0.0f, false, true, 0.0f, 18.6f)
                verticalLineTo(5.4f)
                arcTo(5.385f, 5.385f, 0.0f, false, true, 5.4f, 0.0f)
                horizontalLineToRelative(13.2f)
                arcToRelative(5.595f, 5.595f, 0.0f, false, true, 2.07f, 0.405f)
                arcTo(5.235f, 5.235f, 0.0f, false, true, 22.635f, 1.8f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.42f, 1.005f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, -0.42f, 1.02f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.025f, 0.0f)
                arcTo(2.685f, 2.685f, 0.0f, false, false, 19.59f, 3.0f)
                arcToRelative(2.43f, 2.43f, 0.0f, false, false, -0.99f, -0.195f)
                horizontalLineTo(5.4f)
                arcTo(2.505f, 2.505f, 0.0f, false, false, 2.865f, 5.4f)
                close()
            }
        }
        .build()
        return _ziggo!!
    }

private var _ziggo: ImageVector? = null
