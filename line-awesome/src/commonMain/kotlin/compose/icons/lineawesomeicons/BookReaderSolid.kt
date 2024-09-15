package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.BookReaderSolid: ImageVector
    get() {
        if (_bookReaderSolid != null) {
            return _bookReaderSolid!!
        }
        _bookReaderSolid = Builder(name = "BookReaderSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(12.699f, 4.0f, 10.0f, 6.699f, 10.0f, 10.0f)
                curveTo(10.0f, 11.008f, 10.246f, 11.945f, 10.688f, 12.781f)
                curveTo(8.863f, 12.336f, 6.641f, 12.0f, 4.0f, 12.0f)
                lineTo(2.719f, 12.0f)
                lineTo(6.219f, 26.0f)
                lineTo(7.0f, 26.0f)
                curveTo(10.406f, 26.0f, 12.5f, 26.488f, 13.719f, 26.938f)
                curveTo(14.328f, 27.164f, 14.715f, 27.387f, 14.938f, 27.531f)
                curveTo(15.16f, 27.676f, 15.188f, 27.688f, 15.188f, 27.688f)
                lineTo(15.469f, 28.0f)
                lineTo(16.531f, 28.0f)
                lineTo(16.813f, 27.688f)
                curveTo(16.813f, 27.688f, 16.84f, 27.676f, 17.063f, 27.531f)
                curveTo(17.285f, 27.387f, 17.672f, 27.164f, 18.281f, 26.938f)
                curveTo(19.5f, 26.488f, 21.594f, 26.0f, 25.0f, 26.0f)
                lineTo(25.781f, 26.0f)
                lineTo(29.281f, 12.0f)
                lineTo(28.0f, 12.0f)
                curveTo(25.371f, 12.0f, 23.152f, 12.316f, 21.344f, 12.75f)
                curveTo(21.773f, 11.926f, 22.0f, 10.992f, 22.0f, 10.0f)
                curveTo(22.0f, 6.699f, 19.301f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(18.223f, 6.0f, 20.0f, 7.777f, 20.0f, 10.0f)
                curveTo(20.0f, 12.223f, 18.223f, 14.0f, 16.0f, 14.0f)
                curveTo(13.777f, 14.0f, 12.0f, 12.223f, 12.0f, 10.0f)
                curveTo(12.0f, 7.777f, 13.777f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(5.313f, 14.125f)
                curveTo(8.422f, 14.277f, 10.961f, 14.816f, 12.625f, 15.438f)
                curveTo(13.965f, 15.938f, 14.625f, 16.324f, 15.0f, 16.563f)
                lineTo(15.0f, 25.313f)
                curveTo(14.82f, 25.23f, 14.656f, 25.145f, 14.438f, 25.063f)
                curveTo(13.086f, 24.563f, 10.867f, 24.141f, 7.781f, 24.063f)
                close()
                moveTo(26.688f, 14.125f)
                lineTo(24.219f, 24.063f)
                curveTo(21.133f, 24.141f, 18.914f, 24.563f, 17.563f, 25.063f)
                curveTo(17.344f, 25.145f, 17.18f, 25.23f, 17.0f, 25.313f)
                lineTo(17.0f, 16.563f)
                curveTo(17.375f, 16.32f, 18.031f, 15.93f, 19.344f, 15.438f)
                curveTo(20.996f, 14.816f, 23.539f, 14.277f, 26.688f, 14.125f)
                close()
            }
        }
        .build()
        return _bookReaderSolid!!
    }

private var _bookReaderSolid: ImageVector? = null
