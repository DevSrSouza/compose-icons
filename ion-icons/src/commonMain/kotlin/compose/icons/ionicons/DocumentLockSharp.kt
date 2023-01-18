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

public val IonIcons.DocumentLockSharp: ImageVector
    get() {
        if (_documentLockSharp != null) {
            return _documentLockSharp!!
        }
        _documentLockSharp = Builder(name = "DocumentLockSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(276.0f, 192.0f)
                horizontalLineTo(422.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.42f, -3.41f)
                lineTo(275.41f, 40.27f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 272.0f, 41.69f)
                verticalLineTo(188.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 276.0f, 192.0f)
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
                moveTo(248.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(240.0f, 32.0f)
                lineTo(92.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 44.0f)
                lineTo(80.0f, 468.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(420.0f, 480.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(432.0f, 224.0f)
                close()
                moveTo(336.0f, 399.91f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 319.91f, 416.0f)
                lineTo(192.09f, 416.0f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 176.0f, 399.91f)
                lineTo(176.0f, 320.0f)
                curveToRelative(0.0f, -10.0f, 7.0f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(208.0f, 286.0f)
                curveToRelative(0.0f, -25.36f, 21.53f, -46.0f, 48.0f, -46.0f)
                reflectiveCurveToRelative(48.0f, 20.64f, 48.0f, 46.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _documentLockSharp!!
    }

private var _documentLockSharp: ImageVector? = null
