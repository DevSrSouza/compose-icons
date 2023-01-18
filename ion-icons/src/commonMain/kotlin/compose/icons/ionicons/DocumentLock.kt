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

public val IonIcons.DocumentLock: ImageVector
    get() {
        if (_documentLock != null) {
            return _documentLock!!
        }
        _documentLock = Builder(name = "DocumentLock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 192.0f)
                horizontalLineTo(417.81f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.41f, -3.41f)
                lineTo(275.41f, 44.78f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 272.0f, 46.19f)
                verticalLineTo(176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 288.0f, 192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 272.0f)
                curveToRelative(-8.82f, 0.0f, -16.0f, 6.28f, -16.0f, 14.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(286.0f)
                curveTo(272.0f, 278.28f, 264.82f, 272.0f, 256.0f, 272.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(428.0f, 224.0f)
                horizontalLineTo(288.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, -48.0f)
                verticalLineTo(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(144.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 80.0f, 96.0f)
                verticalLineTo(416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineTo(368.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(228.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 428.0f, 224.0f)
                close()
                moveTo(336.0f, 384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                horizontalLineTo(208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                verticalLineTo(336.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                verticalLineTo(286.0f)
                curveToRelative(0.0f, -25.36f, 21.53f, -46.0f, 48.0f, -46.0f)
                reflectiveCurveToRelative(48.0f, 20.64f, 48.0f, 46.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _documentLock!!
    }

private var _documentLock: ImageVector? = null
