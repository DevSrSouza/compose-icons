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

public val IonIcons.TodaySharp: ImageVector
    get() {
        if (_todaySharp != null) {
            return _todaySharp!!
        }
        _todaySharp = Builder(name = "TodaySharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 456.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(456.0f, 480.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(480.0f, 176.0f)
                lineTo(32.0f, 176.0f)
                close()
                moveTo(112.0f, 217.14f)
                arcToRelative(9.14f, 9.14f, 0.0f, false, true, 9.14f, -9.14f)
                lineTo(230.86f, 208.0f)
                arcToRelative(9.14f, 9.14f, 0.0f, false, true, 9.14f, 9.14f)
                lineTo(240.0f, 326.86f)
                arcToRelative(9.14f, 9.14f, 0.0f, false, true, -9.14f, 9.14f)
                lineTo(121.14f, 336.0f)
                arcToRelative(9.14f, 9.14f, 0.0f, false, true, -9.14f, -9.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.0f, 64.0f)
                horizontalLineTo(400.08f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(159.92f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(56.0f)
                arcTo(23.8f, 23.8f, 0.0f, false, false, 32.0f, 87.77f)
                verticalLineTo(144.0f)
                horizontalLineTo(480.0f)
                verticalLineTo(87.77f)
                arcTo(23.8f, 23.8f, 0.0f, false, false, 456.0f, 64.0f)
                close()
            }
        }
        .build()
        return _todaySharp!!
    }

private var _todaySharp: ImageVector? = null
