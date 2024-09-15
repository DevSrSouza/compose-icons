package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FileCode: ImageVector
    get() {
        if (_fileCode != null) {
            return _fileCode!!
        }
        _fileCode = Builder(name = "FileCode", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 121.94f)
                lineTo(384.0f, 128.0f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                horizontalLineToRelative(6.06f)
                curveToRelative(6.36f, 0.0f, 12.47f, 2.53f, 16.97f, 7.03f)
                lineToRelative(97.94f, 97.94f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 384.0f, 121.94f)
                close()
                moveTo(248.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                lineTo(224.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.74f, 0.0f, 0.0f, 10.74f, 0.0f, 24.0f)
                verticalLineToRelative(464.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                lineTo(384.0f, 160.0f)
                lineTo(248.0f, 160.0f)
                close()
                moveTo(123.21f, 400.51f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -7.63f, 0.25f)
                lineToRelative(-64.87f, -60.81f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 0.0f, -7.88f)
                lineToRelative(64.87f, -60.81f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 7.63f, 0.25f)
                lineToRelative(19.58f, 20.89f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.37f, 7.75f)
                lineTo(101.65f, 336.0f)
                lineToRelative(40.76f, 35.87f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 0.37f, 7.75f)
                lineToRelative(-19.58f, 20.88f)
                close()
                moveTo(174.5f, 450.98f)
                lineToRelative(-27.45f, -7.97f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -3.68f, -6.69f)
                lineToRelative(61.44f, -211.63f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 6.69f, -3.68f)
                lineToRelative(27.45f, 7.97f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 3.68f, 6.69f)
                lineToRelative(-61.44f, 211.63f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -6.69f, 3.68f)
                close()
                moveTo(335.29f, 339.94f)
                lineToRelative(-64.87f, 60.81f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -7.63f, -0.25f)
                lineToRelative(-19.58f, -20.89f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 0.37f, -7.75f)
                lineTo(284.35f, 336.0f)
                lineToRelative(-40.76f, -35.87f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.37f, -7.75f)
                lineToRelative(19.58f, -20.89f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 7.63f, -0.25f)
                lineToRelative(64.87f, 60.81f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.0f, 7.88f)
                close()
            }
        }
        .build()
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
