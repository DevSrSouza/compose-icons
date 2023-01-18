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

public val IonIcons.Documents: ImageVector
    get() {
        if (_documents != null) {
            return _documents!!
        }
        _documents = Builder(name = "Documents", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(298.39f, 248.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.86f, -6.8f)
                lineToRelative(-78.4f, -79.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.85f, 2.81f)
                verticalLineTo(236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.0f, 267.0f)
                arcTo(43.67f, 43.67f, 0.0f, false, true, 184.0f, 236.0f)
                verticalLineTo(144.0f)
                horizontalLineTo(112.0f)
                arcToRelative(64.19f, 64.19f, 0.0f, false, false, -64.0f, 64.0f)
                verticalLineTo(432.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineTo(256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(280.0f)
                horizontalLineTo(228.0f)
                arcTo(43.61f, 43.61f, 0.0f, false, true, 197.0f, 267.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.0f, 120.0f)
                horizontalLineToRelative(70.39f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.86f, -6.8f)
                lineToRelative(-78.4f, -79.72f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 360.0f, 36.29f)
                verticalLineTo(108.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 372.0f, 120.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.0f, 152.0f)
                arcToRelative(44.34f, 44.34f, 0.0f, false, true, -44.0f, -44.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(220.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f)
                verticalLineToRelative(36.0f)
                horizontalLineToRelative(42.12f)
                arcTo(40.81f, 40.81f, 0.0f, false, true, 231.0f, 124.14f)
                lineToRelative(109.16f, 111.0f)
                arcToRelative(41.11f, 41.11f, 0.0f, false, true, 11.83f, 29.0f)
                verticalLineTo(400.0f)
                horizontalLineToRelative(53.05f)
                curveToRelative(32.51f, 0.0f, 58.95f, -26.92f, 58.95f, -60.0f)
                verticalLineTo(152.0f)
                close()
            }
        }
        .build()
        return _documents!!
    }

private var _documents: ImageVector? = null
