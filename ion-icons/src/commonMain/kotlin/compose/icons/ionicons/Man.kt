package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.Man: ImageVector
    get() {
        if (_man != null) {
            return _man!!
        }
        _man = Builder(name = "Man", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 56.0f)
                moveToRelative(-56.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 128.0f)
                horizontalLineTo(208.0f)
                arcToRelative(64.19f, 64.19f, 0.0f, false, false, -64.0f, 64.0f)
                verticalLineTo(299.52f)
                curveToRelative(0.0f, 10.85f, 8.43f, 20.08f, 19.27f, 20.47f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 184.0f, 300.0f)
                verticalLineTo(200.27f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                verticalLineTo(489.0f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, 23.0f, 23.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, 23.0f, -23.0f)
                verticalLineTo(346.34f)
                arcTo(10.24f, 10.24f, 0.0f, false, true, 255.33f, 336.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 266.0f, 346.0f)
                verticalLineTo(489.0f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, 23.0f, 23.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, 23.0f, -23.0f)
                verticalLineTo(200.27f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                verticalLineToRelative(99.52f)
                curveToRelative(0.0f, 10.85f, 8.43f, 20.08f, 19.27f, 20.47f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 368.0f, 300.0f)
                verticalLineTo(192.0f)
                arcTo(64.19f, 64.19f, 0.0f, false, false, 304.0f, 128.0f)
                close()
            }
        }
        .build()
        return _man!!
    }

private var _man: ImageVector? = null
