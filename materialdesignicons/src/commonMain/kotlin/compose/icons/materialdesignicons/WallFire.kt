package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.WallFire: ImageVector
    get() {
        if (_wallFire != null) {
            return _wallFire!!
        }
        _wallFire = Builder(name = "WallFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.14f, 15.34f)
                lineTo(22.12f, 15.35f)
                curveTo(22.35f, 15.63f, 22.55f, 15.94f, 22.7f, 16.27f)
                lineTo(22.79f, 16.46f)
                curveTo(23.5f, 18.15f, 23.0f, 20.1f, 21.69f, 21.32f)
                curveTo(20.5f, 22.41f, 18.84f, 22.7f, 17.3f, 22.5f)
                curveTo(15.84f, 22.32f, 14.5f, 21.4f, 13.73f, 20.13f)
                curveTo(13.5f, 19.74f, 13.3f, 19.3f, 13.2f, 18.85f)
                curveTo(13.07f, 18.5f, 13.03f, 18.12f, 13.0f, 17.75f)
                curveTo(12.91f, 16.15f, 13.55f, 14.45f, 14.76f, 13.45f)
                curveTo(14.21f, 14.66f, 14.34f, 16.17f, 15.15f, 17.22f)
                lineTo(15.26f, 17.35f)
                curveTo(15.4f, 17.47f, 15.57f, 17.5f, 15.73f, 17.44f)
                curveTo(15.88f, 17.38f, 16.0f, 17.23f, 16.0f, 17.07f)
                lineTo(15.93f, 16.83f)
                curveTo(15.05f, 14.5f, 15.79f, 11.8f, 17.66f, 10.27f)
                curveTo(18.17f, 9.85f, 18.8f, 9.47f, 19.46f, 9.3f)
                curveTo(18.78f, 10.66f, 19.0f, 12.44f, 20.09f, 13.5f)
                curveTo(20.55f, 14.0f, 21.11f, 14.29f, 21.58f, 14.73f)
                lineTo(22.14f, 15.34f)
                moveTo(19.86f, 20.0f)
                lineTo(19.85f, 19.97f)
                curveTo(20.3f, 19.58f, 20.55f, 18.91f, 20.53f, 18.31f)
                lineTo(20.5f, 18.0f)
                curveTo(20.3f, 17.0f, 19.43f, 16.66f, 18.87f, 15.93f)
                lineTo(18.44f, 15.15f)
                curveTo(18.22f, 15.65f, 18.2f, 16.12f, 18.29f, 16.66f)
                curveTo(18.39f, 17.23f, 18.61f, 17.72f, 18.5f, 18.31f)
                curveTo(18.34f, 18.96f, 17.83f, 19.61f, 16.94f, 19.82f)
                curveTo(17.44f, 20.31f, 18.25f, 20.7f, 19.06f, 20.42f)
                curveTo(19.32f, 20.35f, 19.65f, 20.16f, 19.86f, 20.0f)
                moveTo(3.0f, 16.0f)
                horizontalLineTo(11.06f)
                lineTo(11.0f, 17.0f)
                curveTo(11.0f, 18.41f, 11.36f, 19.73f, 12.0f, 20.88f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                moveTo(2.0f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                moveTo(9.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.07f)
                curveTo(13.17f, 11.13f, 11.79f, 12.9f, 11.25f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                moveTo(3.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                moveTo(12.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _wallFire!!
    }

private var _wallFire: ImageVector? = null
