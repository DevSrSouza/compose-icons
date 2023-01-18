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

public val IonIcons.DocumentAttach: ImageVector
    get() {
        if (_documentAttach != null) {
            return _documentAttach!!
        }
        _documentAttach = Builder(name = "DocumentAttach", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(460.0f, 240.0f)
                horizontalLineTo(320.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, -48.0f)
                verticalLineTo(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(214.75f)
                arcToRelative(65.42f, 65.42f, 0.0f, false, false, -6.5f, -9.81f)
                curveTo(196.72f, 23.88f, 179.59f, 16.0f, 160.0f, 16.0f)
                curveToRelative(-37.68f, 0.0f, -64.0f, 29.61f, -64.0f, 72.0f)
                verticalLineTo(232.0f)
                curveToRelative(0.0f, 25.0f, 20.34f, 40.0f, 40.0f, 40.0f)
                arcToRelative(39.57f, 39.57f, 0.0f, false, false, 40.0f, -40.0f)
                verticalLineTo(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineTo(232.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, -8.0f, 8.0f)
                curveToRelative(-2.23f, 0.0f, -8.0f, -1.44f, -8.0f, -8.0f)
                verticalLineTo(88.0f)
                curveToRelative(0.0f, -19.34f, 8.41f, -40.0f, 32.0f, -40.0f)
                curveToRelative(29.69f, 0.0f, 32.0f, 30.15f, 32.0f, 39.38f)
                verticalLineTo(226.13f)
                curveToRelative(0.0f, 17.45f, -5.47f, 33.23f, -15.41f, 44.46f)
                curveTo(166.5f, 282.0f, 152.47f, 288.0f, 136.0f, 288.0f)
                reflectiveCurveToRelative(-30.5f, -6.0f, -40.59f, -17.41f)
                curveTo(85.47f, 259.36f, 80.0f, 243.58f, 80.0f, 226.13f)
                verticalLineTo(144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineToRelative(82.13f)
                curveToRelative(0.0f, 51.51f, 33.19f, 89.63f, 80.0f, 93.53f)
                verticalLineTo(432.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineTo(400.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(244.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 460.0f, 240.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 208.0f)
                horizontalLineTo(449.81f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.41f, -3.41f)
                lineTo(307.41f, 60.78f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 304.0f, 62.19f)
                verticalLineTo(192.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 320.0f, 208.0f)
                close()
            }
        }
        .build()
        return _documentAttach!!
    }

private var _documentAttach: ImageVector? = null
